package com.example.CrudSpringBoot.modelo;


import javax.persistence.*;

    @Entity
    @Table(name = "persona")
    public class Persona {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private  String nombre;
        private String apellido;
        private int cedula;
        private String eps;
        private String RH;
        private String caja;
        private String Cargo;
        private  String telefono;
        private int hora_llegada;
        private int hora_salida;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getCedula() {
            return cedula;
        }

        public void setCedula(int cedula) {
            this.cedula = cedula;
        }

        public String getEps() {
            return eps;
        }

        public void setEps(String eps) {
            this.eps = eps;
        }

        public String getRH() {
            return RH;
        }

        public void setRH(String RH) {
            this.RH = RH;
        }

        public String getCaja() {
            return caja;
        }

        public void setCaja(String caja) {
            this.caja = caja;
        }

        public String getCargo() {
            return Cargo;
        }

        public void setCargo(String cargo) {
            Cargo = cargo;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getHora_llegada() {
            return hora_llegada;
        }

        public void setHora_llegada(int hora_llegada) {
            this.hora_llegada = hora_llegada;
        }

        public int getHora_salida() {
            return hora_salida;
        }

        public void setHora_salida(int hora_salida) {
            this.hora_salida = hora_salida;
        }

        public Persona(int id, String nombre, String apellido, int cedula, String eps, String RH, String caja, String cargo, String telefono, int hora_llegada, int hora_salida) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.cedula = cedula;
            this.eps = eps;
            this.RH = RH;
            this.caja = caja;
            Cargo = cargo;
            this.telefono = telefono;
            this.hora_llegada = hora_llegada;
            this.hora_salida = hora_salida;
        }

        public Persona() {
        }
    }

