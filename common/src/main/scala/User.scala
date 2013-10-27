package com.example

case class User(id: String)

object User {
 def create(id: String) = User(id)
}