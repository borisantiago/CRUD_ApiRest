package com.pichincha.demo.interfaceService;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pichincha.demo.models.Usuario;

public interface IUsuario extends JpaRepository<Usuario, Integer> {

}
