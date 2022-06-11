package com.pichincha.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pichincha.demo.interfaceService.IUsuario;
import com.pichincha.demo.models.Usuario;

@RestController
@RequestMapping("api/user")
public class usuarioController {
	
	 @Autowired 
	 private IUsuario iUsuario;
	 
	 //Metodos solicitados al servidor
	 
	 @PostMapping("/create")
	 public void createUsuario(@RequestBody Usuario u) {
		 iUsuario.save(u);
	 }
	 
	 @GetMapping("/list")
	 public List<Usuario>list(){
		 return iUsuario.findAll();
	 }
	 
	 @PutMapping("/update")
	 public void update(@RequestBody Usuario u){
		 iUsuario.save(u);
	 }
	 
	 
	 
	 @DeleteMapping("/delete/{cedula}")
	 public void delete(@PathVariable("cedula") Integer cedula) {
		 iUsuario.deleteById(cedula);
	 }
	
	

}
