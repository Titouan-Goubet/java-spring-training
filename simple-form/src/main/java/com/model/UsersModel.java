package com.model;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users_table")

public class UsersModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  String login;
  String password;
  String email;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true; // Vérifie si les objets sont identiques
    if (o == null || getClass() != o.getClass())
      return false; // Vérifie si l'objet est null ou d'une autre classe

    UsersModel that = (UsersModel) o; // Cast l'objet à comparer en UsersModel

    // Comparer chaque champ avec Objects.equals() pour gérer les nulls
    return Objects.equals(id, that.id) &&
        Objects.equals(login, that.login) &&
        Objects.equals(password, that.password) &&
        Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, login, password, email);
  }

  public String toString() {
    return "UsersModel{" +
        "id=" + id +
        ", login='" + login + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}