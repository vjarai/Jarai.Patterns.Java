Übung State Pattern
===================

Ein Telefon kann folgende drei Zustände annehmen: Aufgelegt, Abgehoben und Verbunden.

Folgende operation sind erfolgreich und führen zu einem neuen Zustand:

Aufgelegt.abheben() => Abgehoben
Aufgelegt.anrufAnnehmen => Verbunden

Abgehoben.waehlen() => Verbunden
Abgehoben.auflegen() => Aufgelegt

Verbunden.sprechen() => Verbunden
Verbunden.auflegen() => Aufgelegt

Implementieren Sie die Klasse Telefon und alle Zustands Klassen so, dass alle TelefonTests grün werden.
Es darf keine einzige Kontrollstruktur (if / switch / ...) verwendet werden!
