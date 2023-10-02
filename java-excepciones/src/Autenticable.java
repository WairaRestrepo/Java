public  interface Autenticable {
    //La interface es abstract y los metos igualmente.
    public  void setClave(String clave);
    public boolean iniciarSesion(String clave);
}
