# pglp_4.1 (Builder, Composite, Iterator)

Développement d'un annuaire des Personnels d'une organisation en java en utilisant les designs patterns (Builder, Composite et Iterator).

## Description:

Dans cet exercice, vous réaliserez un annuaire des personnels d’une organisation.
Un personnel possède un nom, un prénom, une date de naissance, des numéros de téléphone (fixe pro,
fixe perso, portable, . . .) et des fonctions (par exemple directeur de XXX, chargé de mission XXX, . . .).
L’annuaire reflétera la structure hiérarchique de l’organisation (par exemple, département/service/équipe).
Chaque niveau peut comporter des individus ou des sous-hiérarchies. Les différents niveaux de
structuration ne sont pas connus à priori.
On veut pouvoir afficher les personnels de l’organisation de deux manières : hiérarchiques (en profondeur)
et par groupe (en largeur).