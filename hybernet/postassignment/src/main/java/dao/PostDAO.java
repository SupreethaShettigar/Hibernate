package dao;

import java.util.List;

import mphasis.postassignment.*;

public interface PostDAO {
	
	Post insert(Post post);
	Post update(Post post);
	Status delete(Post post);
	List<Post> view();
}