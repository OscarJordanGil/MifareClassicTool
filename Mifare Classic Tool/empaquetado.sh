#!/bin/bash
echo "Compilado"
./gradlew assemble
echo "Apk generado"
sleep 5
echo "Analisis"
/home/alumno/Escritorio/pmd-bin-7.0.0-rc3/bin/pmd check -f text -R rulesets/java/quickstart.xml -d ./app/src/
echo "Analisis realizado"
sleep 5
