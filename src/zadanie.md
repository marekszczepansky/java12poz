# Zadanie wykorzystujądze wiedzę i zgromadzony kod

## Opis celu zadania

Zbudujemy klasę reprezentującą bazę danych osób (klasa `Person`). Klasa będzie składowała dane w tablicy posortowanej wg pola `birthDate`. Dodatkowo rekordy będą wskazywane (przechowywane) przez dwie listy w kolejności posortowanej odpowiednio wg pola `name` i `lastName`. Klasa będzie udostępniała metody pozwalające na dodawanie nowych osób, wyszukiwanie osón wg daty urodzenia, imienia i nazwiska, zwrócenie wszyskich rekordów w kolejności dat urodzenia, imion i nazwisk oraz usuwania podanego rekordu.

## struktura klasy
Klasa musi składać się z trzech podstawowych struktur:

- tablica obiektów typu `Person`, zainicjowana pustą tablicą (np. `personArray`)
- lista obiektów typu Person w kolejności imion (np. `personByName`)
- lista obiektów typu Person w kolejności nazwisk (np. `personByLastName`)
