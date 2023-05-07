package org.zerock.mreview.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.mreview.dto.MovieDTO;

@SpringBootTest
public class MovieServiceTests {
    @Autowired
    private MovieService movieService;

    @Test
    public void registerTest() {
        MovieDTO movieDTO = MovieDTO.builder().title("test").imageDTOList(null).build();

        System.out.println(movieService.register(movieDTO));
    }
}
