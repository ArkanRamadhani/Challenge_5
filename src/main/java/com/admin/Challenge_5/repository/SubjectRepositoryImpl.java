package com.admin.Challenge_5.repository;

import com.admin.Challenge_5.bean.Subject;

import java.util.Optional;

public class SubjectRepositoryImpl extends SubjectRepository {
    /**
     * @param entity
     * @param <S>
     * @return
     */
    @Override
    public <S extends Subject> S save(S entity) {
        return null;
    }

    /**
     * @param entities
     * @param <S>
     * @return
     */
    @Override
    public <S extends Subject> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    /**
     * @param s
     * @return
     */
    @Override
    public Optional<Subject> findById(String s) {
        return Optional.empty();
    }

    /**
     * @param s
     * @return
     */
    @Override
    public boolean existsById(String s) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public Iterable<Subject> findAll() {
        return null;
    }

    /**
     * @param strings
     * @return
     */
    @Override
    public Iterable<Subject> findAllById(Iterable<String> strings) {
        return null;
    }

    /**
     * @return
     */
    @Override
    public long count() {
        return 0;
    }

    /**
     * @param s
     */
    @Override
    public void deleteById(String s) {

    }

    /**
     * @param entity
     */
    @Override
    public void delete(Subject entity) {

    }

    /**
     * @param strings
     */
    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    /**
     * @param entities
     */
    @Override
    public void deleteAll(Iterable<? extends Subject> entities) {

    }

    /**
     *
     */
    @Override
    public void deleteAll() {

    }
}
