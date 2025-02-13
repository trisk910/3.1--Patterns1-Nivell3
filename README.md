# Pràctica de Patrons de Disseny en Java

En aquesta pràctica aprendrem a identificar i construir programes emprant patrons de disseny. La utilització de patrons és fonamental en la construcció d'un software extensible i reutilitzable. El llenguatge Java, així com tots els frameworks de software, estan fets d'acord amb els patrons més importants del software.

## Nivell 1 - Singleton
En aquest nivell, implementarem el patró **Singleton** per crear una classe `Undo` que repliqui el funcionament del comando 'Undo'.

### Requisits:
- La classe `Undo` ha de guardar les últimes comandes introduïdes.
- Ha de permetre afegir o eliminar comandes.
- Ha de llistar les últimes comandes introduïdes (semblant a la comanda 'history' en Linux).
- Ha de ser una implementació del patró **Singleton**.
- Ha de ser utilitzada per la classe `Main`, que permetrà introduir opcions per consola.

## Nivell 2 - Abstract Factory
En aquest nivell, implementarem el patró **Abstract Factory** per crear un gestor de direccions i números de telèfon internacionals.

### Requisits:
- L'aplicació ha de permetre afegir a l'agenda adreces i números de telèfon internacionals.
- Tenint en compte els diferents formats dels diferents països, s'ha de construir l'agenda, les adreces i els telèfons mitjançant el patró **Abstract Factory**.

## Nivell 3 - Command
En aquest nivell, implementarem el patró **Command** per gestionar un pàrquing de diferents vehicles.

### Requisits:
- S'ha de dissenyar un pàrquing que contingui 4 tipus de vehicles: un cotxe, una bicicleta, un avió i un vaixell.
- Implementar el patró **Command** per gestionar les accions dels vehicles.
- Les accions han de ser: `arrencar`, `accelerar` i `frenar`.

## Instal·lació i Execució
1. Clona aquest repositori:
   ```bash
   git clone https://github.com/el-teu-usuari/el-teu-repositori.git
   ```
2. Obre el projecte en el teu entorn de desenvolupament preferit (Eclipse, IntelliJ, VS Code).
3. Compila i executa la classe `Main` per provar cada nivell de la pràctica.

## Contribució
Si vols contribuir a aquest projecte, si us plau, fes un fork del repositori i crea una pull request amb les teves millores.

## Llicència
Aquest projecte està sota la llicència MIT. Vegeu el fitxer `LICENSE` per a més informació.

---

**Autoria:**
- Nom: Marc Bernabeu
- Contacte: @trisk910
