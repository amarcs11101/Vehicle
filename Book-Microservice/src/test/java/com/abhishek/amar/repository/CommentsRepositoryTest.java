package com.abhishek.amar.repository;

import static org.mockito.Mockito.when;

import org.springframework.boot.test.mock.mockito.MockBean;

import com.abhishek.amar.entity.Comments;
import com.abhishek.amar.enums.Ratings;

class CommentsRepositoryTest {

	@MockBean
	CommentsRepository commentsRepo;

	public void save() {
		Comments comments = new Comments();
		comments.setComments("ABC");
		comments.setFromCustomerId(1);
		comments.setRatings(Ratings.FIFTH_STAR);
		comments.setToCustomerId(1);
		when(commentsRepo.save(comments)).thenReturn(comments);
	}
}
