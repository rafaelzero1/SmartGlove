package com.example.smartglove;

public class Api {

    //URL para acesso ao bando de dados WEB Service
    private static final String ROOT_URL = "http://e3a1d605.ngrok.io/SmartGloveApi/v1/Api.php?apicall=";

    //Variáveis estáticas e globais para acesso os métodos no WEB Service
    public static final String URL_CREATE_USER = ROOT_URL + "createuser";
    public static final String URL_LOGIN_USER = ROOT_URL + "loginuser";
    public static final String URL_LOADING_USER = ROOT_URL + "loadinguser";
    public static final String URL_ALTER_USER = ROOT_URL + "alteruser";
    public static final String URL_UPDATE_NOME = ROOT_URL + "updatenome";
    public static final String URL_UPDATE_PESO = ROOT_URL + "updatepeso";
    public static final String URL_UPDATE_EMAIL = ROOT_URL + "updateemail";
    public static final String URL_UPDATE_SENHA = ROOT_URL + "updatesenha";
    public static final String URL_UPDATE_ESPORTE = ROOT_URL + "updateesporte";
    public static final String URL_CREATE_TREINO = ROOT_URL + "createtreino";
    public static final String URL_LOADING_TREINER = ROOT_URL + "loadingtreiner";
    public static final String URL_DELETE_TREINER = ROOT_URL + "deletetreiner&id_treino=";
}
