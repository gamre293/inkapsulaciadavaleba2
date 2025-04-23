import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GalleryController {

    @FXML
    private ImageView imageView;
    @FXML
    private Button prevButton, nextButton;

    private Image[] images = new Image[10];
    private int currentIndex = 0;

    @FXML
    public void initialize() {
        for (int i = 0; i < 10; i++) {
            images[i] = new Image(getClass().getResourceAsStream("/images/img" + i + ".jpg"));
        }

        updateImageView();
    }

    @FXML
    private void showPrevious() {
        if (currentIndex > 0) {
            currentIndex--;
            updateImageView();
        }
    }

    @FXML
    private void showNext() {
        if (currentIndex < images.length - 1) {
            currentIndex++;
            updateImageView();
        }
    }

    private void updateImageView() {
        imageView.setImage(images[currentIndex]);
        prevButton.setDisable(currentIndex == 0);
        nextButton.setDisable(currentIndex == images.length - 1);
    }
}
