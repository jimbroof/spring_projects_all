package guru.springframework.services;

import org.springframework.web.multipart.MultipartFile;


/**
 * Created by Joachim on 12/07/2018.
 */
public interface ImageService {

    void saveImageFile(Long recipeId, MultipartFile file);

}
