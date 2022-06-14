package com.example.datentypenuniversum

class Entfernungen {
    /**
     * Diese Funktion liefert die Entfernungen zur Erde in einer Liste
     */
    fun distanceToEarth(): MutableList<Number> {

        // Entfernungen zur Erde in km
        // todo Schreibe hier deinen Code
        val merkur: Int = 77300000
        val venus: Int = 38200000
        val mond: Int = 360000
        val erde: Byte = 0
        val iss: Short = 408
        val mars: Int = 55700000
        val jupiter: Int = 588500000
        val saturn: Int = 1195500000
        val uranus:Float = 2518900000f
        val neptun:Float = 4305900000f

        // Erstelle eine veränderbare Liste
        // todo Schreibe hier deinen Code
        val listDTE = mutableListOf<Number>()

        // Füge die Entfernungen hinzu
        // todo Schreibe hier deinen Code
        listDTE.add(merkur)
        listDTE.add(venus)
        listDTE.add(mond)
        listDTE.add(erde)
        listDTE.add(iss)
        listDTE.add(mars)
        listDTE.add(jupiter)
        listDTE.add(saturn)
        listDTE.add(uranus)
        listDTE.add(neptun)

        // Liefere die Entfernungen zurück
        return listDTE
    }

    /**
     * Diese Funktion liefert die Entfernungen zur Sonne in AE, in einer Liste
     */
    fun distanceToSunAE(distances: MutableList<Number>): MutableList<Number> {

        // 1 Astronomische Einheit [AE], entspricht der Entfernung von Erde zu Sonne
        val ae = 149597870.7

        // Erstelle eine veränderbare Liste
        // todo Schreibe hier deinen Code
        var listDTS: MutableList<Number> = mutableListOf()

        // Berechne die Entfernungen in AE
        // todo Schreibe hier deinen Code
        val merkurDTS = (distances[0].toDouble() / ae)
        val venusDTS = (distances[1].toDouble() / ae)
        val mondDTS = (distances[2].toDouble() / ae)
        val erdeDTS = (distances[3].toDouble() / ae)
        val issDTS = (distances[4].toDouble() / ae)
        val marsDTS = (distances[5].toDouble() / ae)
        val jupiterDTS = (distances[6].toDouble() / ae)
        val saturnDTS = (distances[7].toDouble() / ae)
        val uranusDTS = (distances[8].toDouble() / ae)
        val neptunDTS = (distances[9].toDouble() / ae)

        // Runde die Entfernungen auf 2 Nachkommastellen
        // todo Schreibe hier deinen Code

        val merkurAE = (merkurDTS*100).toInt().toFloat()/100
        val venusAE = (venusDTS*100).toInt().toFloat()/100
        val mondAE = (mondDTS*100).toInt().toFloat()/100
        val erdeAE = (erdeDTS*100).toInt().toFloat()/100
        val issAE = (issDTS*100).toInt().toFloat()/100
        val marsAE = (marsDTS*100).toInt().toFloat()/100
        val jupiterAE = (jupiterDTS*100).toInt().toFloat()/100
        val saturnAE = (saturnDTS*100).toInt().toFloat()/100
        val uranusAE = (uranusDTS*100).toInt().toFloat()/100
        val neptunAE = (neptunDTS*100).toInt().toFloat()/100

        // Füge die Entfernungen in die Liste ein
        // todo Schreibe hier deinen Code
        listDTS.add(merkurAE)
        listDTS.add(venusAE)
        listDTS.add(mondAE)
        listDTS.add(erdeAE)
        listDTS.add(issAE)
        listDTS.add(marsAE)
        listDTS.add(jupiterAE)
        listDTS.add(saturnAE)
        listDTS.add(uranusAE)
        listDTS.add(neptunAE)


        // Liefere die Liste zurück
        return listDTS
    }


}
