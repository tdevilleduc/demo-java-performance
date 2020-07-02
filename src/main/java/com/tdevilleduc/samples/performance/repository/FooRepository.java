package com.tdevilleduc.samples.performance.repository;

import com.tdevilleduc.samples.performance.model.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Integer> {

}
