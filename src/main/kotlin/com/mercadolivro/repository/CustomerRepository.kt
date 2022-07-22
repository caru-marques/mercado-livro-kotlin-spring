package com.mercadolivro.repository

import com.mercadolivro.model.CustomerModel
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository : JpaRepository<CustomerModel, Int> {

    fun findByNameContaining(name: String): List<CustomerModel>
    fun findByEmailContaining(email: String): List<CustomerModel>
    fun existByEmail(email: String): Boolean
    fun findByEmail(email: String): CustomerModel?

}
