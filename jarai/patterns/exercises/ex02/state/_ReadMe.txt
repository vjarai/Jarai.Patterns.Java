State Pattern
=============

Ein Telefon kann drei Zust�nde annehmen: Aufgelegt, Abgehoben und Verbunden.

Die folgenden Operationen sind nur im jeweiligen Zustand erfolgreich und f�hren zu einem neuen Folgezustand:

Aufgelegt.abheben() => Abgehoben
Aufgelegt.anrufAnnehmen => Verbunden

Abgehoben.waehlen() => Verbunden
Abgehoben.auflegen() => Aufgelegt

Verbunden.sprechen() => Verbunden
Verbunden.auflegen() => Aufgelegt

Wenn eine Operation aus einem daf�r ung�ltigen Zustand heraus aufgerufen wird, erfolgt eine Fehlermeldung (IllegalStateException)

Implementieren Sie die Klasse Telefon und alle Zustands Klassen so, dass alle TelefonTests gr�n werden.

Es darf keine einzige Kontrollstruktur (if / switch / ...) verwendet werden!
