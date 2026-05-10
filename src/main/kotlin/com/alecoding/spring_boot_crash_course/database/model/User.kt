package com.alecoding.spring_boot_crash_course.database.model

import jakarta.validation.constraints.Email
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document("users")
class User (
    val email: String,
    val hashedPassword: String,
    @Id val id: ObjectId
)