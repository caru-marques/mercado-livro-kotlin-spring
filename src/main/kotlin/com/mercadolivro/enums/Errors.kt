package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {

    ML0000("ML-0000", "Access Denied"),
    ML9000("ML-9000", "Unable to Authenticate"),
    ML0001("ML-0001", "Invalid Request"),
    ML1001("ML-1001", "Book [%s] not exists"),
    ML1002("ML-1002", "Cannot update book with status [%s]"),
    ML1101("ML-1101", "Customer [%s] not exists")
}