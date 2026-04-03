CREATE DATABASE  IF NOT EXISTS `artsy` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `artsy`;
-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: artsy
-- ------------------------------------------------------
-- Server version	8.0.44

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `obras`
--

DROP TABLE IF EXISTS `obras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `obras` (
  `idobras` int NOT NULL AUTO_INCREMENT,
  `idusuario` int NOT NULL,
  `artista` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `vendedor` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `titulo` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `descricao` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `preco` double NOT NULL,
  PRIMARY KEY (`idobras`),
  KEY `idusuario` (`idusuario`),
  CONSTRAINT `obras` FOREIGN KEY (`idusuario`) REFERENCES `usuarios` (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `obras`
--

LOCK TABLES `obras` WRITE;
/*!40000 ALTER TABLE `obras` DISABLE KEYS */;
INSERT INTO `obras` VALUES (1,6,'Leonardo Di Vinci','O Despertar da Aurora','Marcos Oliveira','Pintura a óleo sobre tela, estilo impressionista.',1500),(2,5,'Leonardo Di Vinci','Sombras do Passado','Sandra Helena','Escultura em bronze fundido, edição limitada.',3200.5),(3,1,'Beatriz Portinari','Caminho das Flores','Ricardo Santos','Aquarela vibrante representando a primavera europeia.',450),(4,5,'Beatriz Portinari','Abstrato Azul','Ricardo Santos','Obra abstrata com texturas em acrílico.',890),(5,4,'Vik Muniz Junior','Retrato de um Sonho','Vik Muniz Junior','Desenho realista feito inteiramente a carvão.',1200),(6,2,'Vik Muniz Junior','Metrópole Noturna','Vik Muniz Junior','Fotografia urbana em preto e branco, moldura de madeira.',250),(7,4,'Helena de Troia','Escultura Futurista X1','Marcos Oliveira','Peça feita em impressora 3D com acabamento manual.',2100),(9,6,'Arthur Galpão','Tapeçaria Ancestral','Sandra Helena','Tecelagem manual com fios tingidos naturalmente.',4500),(10,3,'Arthur Galpão','Vaso de Cerâmica Terra','Marcos Oliveira','Cerâmica queimada em alta temperatura com esmalte fosco.',350),(11,4,'Leonardo Di Vinci','Horizonte Infinito','Patrícia Lima','Painel de 2 metros em tinta acrílica.',2800),(12,4,'Beatriz Portinari','Bailarina de Vidro','Patrícia Lima','Escultura delicada em vidro soprado.',1750),(13,1,'Vik Muniz Junior','Mãos que Criam','Vik Muniz Junior','Estudo anatômico em grafite sobre papel canson.',550),(14,6,'Helena de Troia','Interface Humana','Sandra Helena','Colagem surrealista de recortes de jornal e tinta.',420),(15,2,'Arthur Galpão','Anel de Prata Esculpido','Ricardo Santos','Joia artesanal inspirada em formas orgânicas.',3200),(16,5,'Ana Paula','Obra de Arte','Leonardo','Obra de Arte.',3000),(17,2,'Ana Paula','Arte','Ana Paula','Quadro.',2346);
/*!40000 ALTER TABLE `obras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idusuario` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `usuario` varchar(110) COLLATE utf8mb4_general_ci NOT NULL,
  `email` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `senha` varchar(100) COLLATE utf8mb4_general_ci NOT NULL,
  `role` varchar(20) COLLATE utf8mb4_general_ci NOT NULL DEFAULT 'CLIENTE',
  PRIMARY KEY (`idusuario`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Leonardo Di Vinci','Leonardo1223','leo@galeria.com','17263543Am','CLIENTE'),(2,'Beatriz Portinari','Beatriz2324','bea.artes@email.com','816M836s5','CLIENTE'),(3,'Vik Muniz Junior','Vik1000','vik.fotos@studio.com','9283746Ba','CLIENTE'),(4,'Helena de Troia','Helena1323','helena.esculturas@uol.com','24928374Ba','ADMIN'),(5,'Arthur Galpão','Arthur3443','arthur.design@gmail.com','mM22022242','ADMIN'),(6,'Marcos Oliveira','Marcos2345','marcos.vendas@galeria.com','3352585Bj','ADMIN'),(8,'Marina','Marina1234','Marina@gmail.com','1234567Ma','CLIENTE'),(9,'Marcos','Marcos1234','Marcos123@gmail.com','1234567Ma','CLIENTE');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-04-03 18:41:05
