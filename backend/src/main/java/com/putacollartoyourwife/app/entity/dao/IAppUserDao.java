package com.putacollartoyourwife.app.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.putacollartoyourwife.app.entity.model.AppUser;

public interface IAppUserDao extends CrudRepository<AppUser, Long>{

}
