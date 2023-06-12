package com.dagy.cleanarchi.delivery.delivery.infrastructure.postgres.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface JpaUserRepository extends JpaRepository<UserDataMapper, String> {
}
