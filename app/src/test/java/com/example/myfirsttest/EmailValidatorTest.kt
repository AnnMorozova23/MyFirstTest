package com.example.myfirsttest

import junit.framework.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailYandex_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@yandex.ru"))
    }


    @Test
    fun emailValidator_CorrectEmailSubDomainYandex_ReturnsTrue() {
        assertTrue(EmailValidator.isValidEmail("name@yandex.by"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(EmailValidator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertNotNull("E-mail is null",EmailValidator.isValidEmail(null))
    }

}