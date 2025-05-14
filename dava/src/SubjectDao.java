package dao;

import model.Subject;
import util.Lesson;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SubjectDao {

    public void create(Subject subject) {
        String sql = "INSERT INTO subjects (subject_name) VALUES (?)";
        try (Connection conn = Lesson.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, subject.getSubjectName());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Subject getById(int id) {
        String sql = "SELECT * FROM subjects WHERE id = ?";
        try (Connection conn = Lesson.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Subject(rs.getInt("id"), rs.getString("subject_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Subject> getAll() {
        List<Subject> subjects = new ArrayList<>();
        String sql = "SELECT * FROM subjects";
        try (Connection conn = Lesson.getConnection(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                subjects.add(new Subject(rs.getInt("id"), rs.getString("subject_name")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return subjects;
    }

    public void update(Subject subject) {
        String sql = "UPDATE subjects SET subject_name = ? WHERE id = ?";
        try (Connection conn = Lesson.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, subject.getSubjectName());
            stmt.setInt(2, subject.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM subjects WHERE id = ?";
        try (Connection conn = Lesson.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
