�bung State Pattern
===================

Ein Telefon kann folgende drei Zust�nde annehmen: Aufgelegt, Abgehoben und Verbunden.

Folgende operation sind erfolgreich und f�hren zu einem neuen Zustand:

Aufgelegt.abheben() => Abgehoben
Aufgelegt.anrufAnnehmen => Verbunden

Abgehoben.waehlen() => Verbunden
Abgehoben.auflegen() => Aufgelegt

Verbunden.sprechen() => Verbunden
Verbunden.auflegen() => Aufgelegt

Implementieren Sie die Klasse Telefon und alle Zustands Klassen so, dass alle TelefonTests gr�n werden.
Es darf keine einzige Kontrollstruktur (if / switch / ...) verwendet werden!
