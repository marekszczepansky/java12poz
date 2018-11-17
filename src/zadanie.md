# Zadanie wykorzystujące wiedzę i zgromadzony kod

## Opis celu zadania

Zbudujemy klasę reprezentującą bazę danych osób (klasa `Person`). Klasa będzie składowała dane w tablicy posortowanej wg pola `birthDate`. Dodatkowo rekordy będą wskazywane (przechowywane) przez dwie listy (`MyList`) w kolejności posortowanej odpowiednio wg pola `name` i `lastName`. Klasa będzie udostępniała metody pozwalające na dodawanie nowych osób, wyszukiwanie osób wg daty urodzenia, imienia i nazwiska, zwrócenie wszyskich rekordów w kolejności dat urodzenia, imion i nazwisk oraz usuwania podanego rekordu.

Dla ułatwienia pole `birthDate` można zamienić na `age`

## struktura klasy
Klasa musi składać się z trzech podstawowych struktur:

- tablica obiektów typu `Person`, zainicjowana pustą tablicą (np. `personArray`)
- lista obiektów typu Person w kolejności imion (np. `personByName`)
- lista obiektów typu Person w kolejności nazwisk (np. `personByLastName`)

## metody klasy
Klasa musi udostępniać następujące metody:

- `MyList<Person> findAll()` - metoda zwracające listę wszystkich osób w kolejności domyślnej (tak jak w tablicy `personArray`)
- `MyList<Person> findAllSortByName()` - metoda zwraca listę wszyskich osób w kolejności wg imienia (tak jak w liście `personByName`)
- `MyList<Person> findAllSortByLastName()` - metoda zwraca listę wszyskich osób w kolejności nazwiska (tak jak w liście `personByLastName`)
- `addPerson(Person person)` - metoda dodająca osobę do tablicy `personArray` na odpowiedniej pozycji wg `birthDate`, oraz do list `personByName` i `personByLastName` na odpowiedniej pozycji zachowując posortowanie
- `MyList<Person> findByBirthDate(LocalDate birthDate)` - metoda wyszukująca osoby wg pola `birthDate`
- `MyList<Person> findByName(String name)` - metoda wyszukująca osoby wg pola `name`
- `MyList<Person> findByName(String lastName)` - metoda wyszukująca osoby wg pola `lastName`
- `int deleteByBirthDate(LocalDate birthDate)` - metoda usuwa osoby posiadające podaną wartość w polu `birthDate`, wynikiem jest liczba usuniętych rekordów.
- `int deleteByName(String name)` - metoda usuwa osoby posiadające podaną wartość w polu `name`, wynikiem jest liczba usuniętych rekordów.
- `int deleteByLastName(String lastName)` - metoda usuwa osoby posiadające podaną wartość w polu `lastName`, wynikiem jest liczba usuniętych rekordów.









