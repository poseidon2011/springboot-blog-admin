package com.blog.responsitory;

import com.blog.domain.Category;
import com.blog.domain.Tag;
import com.blog.dto.CategoryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

/**
 * @author: yukong
 * @date: 2018/6/6 15:24
 * @description:
 */
public interface TagRepository  extends JpaRepository<Tag,Long>,JpaSpecificationExecutor<Tag> {


}
