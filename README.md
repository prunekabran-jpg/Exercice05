# Exercice05 - Programmation Orientée Objet en Java

## 📌 Description
Ce projet est un exercice pratique de programmation orientée objet en Java.  
Il implémente plusieurs pièces d’échecs (`Rook`, `Bishop`, `Queen`) avec leurs règles de déplacement, ainsi qu’une classe `Main` servant de point d’entrée pour tester le comportement des pièces.

L’objectif est de mettre en œuvre :
- L’héritage (`Queen`, `Rook`, `Bishop` héritent de `Piece`)
- La surcharge de méthodes (`isValidMove`)
- La gestion de positions sur un plateau d’échecs

---

## 📂 Structure du projet
src/
├── Piece.java       # Classe de base pour toutes les pièces
├── Position.java    # Représente une case du plateau
├── Rook.java        # Déplacements de la Tour
├── Bishop.java      # Déplacements du Fou
├── Queen.java       # Déplacements de la Reine
└── Main.java        # Point d’entrée avec tests
