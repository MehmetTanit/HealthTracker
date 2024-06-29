NNEUESTE VERSIONN
Unser Projekt ist ein Gesundheitstracker, der grundlegende Gesundheitskriterien(Werte) 
wie Herzfrequenz, Blutdruck, Gewicht, Schrittzähler, Schlafmuster und Blutzuckerspiegel 
für Benutzer speichert und es ihnen ermöglicht, diese Daten zu erfassen, zu verwalten und später abzurufen.


Hier sind sieben mögliche Use Cases für deine HealthTracker-Webanwendung:

### Use Case 1: Herzfrequenz speichern

**Akteur**: Benutzer

**Beschreibung**: Ein Benutzer speichert einen neuen Herzfrequenzwert.


**Hauptablauf**:
1. Der Benutzer gibt den Herzfrequenzwert ein.
2. Der Benutzer klickt auf "Speichern".
3. Das System speichert den Herzfrequenzwert in der Datenbank.
4. Der neue Wert wird in der Liste der Herzfrequenzwerte angezeigt.

**Nachbedingungen**:
- Der Herzfrequenzwert ist in der Liste der Werte sichtbar.

**Ausnahmen**:
- Wenn der Wert fehlt oder ungültig ist, zeigt das System eine Fehlermeldung an.

### Use Case 2: Blutdruck speichern

**Akteur**: Benutzer

**Beschreibung**: Ein Benutzer speichert einen neuen Blutdruckwert.

**Vorbedingungen**:
- Der Benutzer ist auf der Blutdruckseite.

**Hauptablauf**:
1. Der Benutzer gibt den systolischen und diastolischen Blutdruckwert ein.
2. Der Benutzer klickt auf "Speichern".
3. Das System speichert die Blutdruckwerte in der Datenbank.
4. Die neuen Werte werden in der Liste der Blutdruckwerte angezeigt.

**Nachbedingungen**:
- Die Blutdruckwerte sind in der Liste der Werte sichtbar.

**Ausnahmen**:
- Wenn die Werte fehlen oder ungültig sind, zeigt das System eine Fehlermeldung an.

### Use Case 3: Blutzucker speichern

**Akteur**: Benutzer

**Beschreibung**: Ein Benutzer speichert einen neuen Blutzuckerwert.

**Vorbedingungen**:
- Der Benutzer ist auf der Blutzuckerseite.

**Hauptablauf**:
1. Der Benutzer gibt den Blutzuckerwert ein.
2. Der Benutzer klickt auf "Speichern".
3. Das System speichert den Blutzuckerwert in der Datenbank.
4. Der neue Wert wird in der Liste der Blutzuckerwerte angezeigt.

**Nachbedingungen**:
- Der Blutzuckerwert ist in der Liste der Werte sichtbar.

**Ausnahmen**:
- Wenn der Wert fehlt oder ungültig ist, zeigt das System eine Fehlermeldung an.

### Use Case 4: Schrittzähler speichern

**Akteur**: Benutzer

**Beschreibung**: Ein Benutzer speichert eine neue Schrittanzahl.

**Vorbedingungen**:
- Der Benutzer ist auf der Schrittzählerseite.

**Hauptablauf**:
1. Der Benutzer gibt die Schrittanzahl ein.
2. Der Benutzer gibt das tägliche Ziel ein.
3. Der Benutzer klickt auf "Speichern".
4. Das System speichert die Schrittanzahl und das Ziel in der Datenbank.
5. Die neuen Werte werden in der Liste der Schrittzählerwerte angezeigt.

**Nachbedingungen**:
- Die Schrittanzahl und das Ziel sind in der Liste der Werte sichtbar.

**Ausnahmen**:
- Wenn die Werte fehlen oder ungültig sind, zeigt das System eine Fehlermeldung an.

### Use Case 5: Schlafmuster speichern

**Akteur**: Benutzer

**Beschreibung**: Ein Benutzer speichert ein neues Schlafmuster.

**Vorbedingungen**:
- Der Benutzer ist auf der Schlafmusterseite.

**Hauptablauf**:
1. Der Benutzer gibt die Schlafdauer, die Leichtschlafdauer, die Tiefschlafdauer und die Anzahl der Unterbrechungen ein.
2. Der Benutzer klickt auf "Speichern".
3. Das System berechnet die Schlafqualität.
4. Das System speichert die Schlafmuster in der Datenbank.
5. Die neuen Werte werden in der Liste der Schlafmuster angezeigt.

**Nachbedingungen**:
- Die Schlafmuster sind in der Liste der Werte sichtbar.

**Ausnahmen**:
- Wenn die Werte fehlen oder ungültig sind, zeigt das System eine Fehlermeldung an.

### Use Case 6: Gewicht speichern

**Akteur**: Benutzer

**Beschreibung**: Ein Benutzer speichert einen neuen Gewichtswert.

**Vorbedingungen**:
- Der Benutzer ist auf der Gewichtseite.

**Hauptablauf**:
1. Der Benutzer gibt den Gewichtswert ein.
2. Der Benutzer klickt auf "Speichern".
3. Das System speichert den Gewichtswert in der Datenbank.
4. Der neue Wert wird in der Liste der Gewichtswerte angezeigt.

**Nachbedingungen**:
- Der Gewichtswert ist in der Liste der Werte sichtbar.

**Ausnahmen**:
- Wenn der Wert fehlt oder ungültig ist, zeigt das System eine Fehlermeldung an.

### Use Case 7: Werte löschen

**Akteur**: Benutzer

**Beschreibung**: Ein Benutzer löscht einen gespeicherten Wert (z.B. Blutdruck, Blutzucker, etc.).

**Vorbedingungen**:
- Der Benutzer ist auf der Seite mit der Liste der Werte, die gelöscht werden sollen.

**Hauptablauf**:
1. Der Benutzer klickt auf "Löschen" neben dem gewünschten Wert.
2. Das System fragt den Benutzer zur Bestätigung.
3. Der Benutzer bestätigt die Löschung.
4. Das System löscht den Wert aus der Datenbank.
5. Der gelöschte Wert wird aus der Liste der Werte entfernt.

**Nachbedingungen**:
- Der Wert ist nicht mehr in der Liste sichtbar.

**Ausnahmen**:
- Wenn der Löschvorgang fehlschlägt, zeigt das System eine Fehlermeldung an.

