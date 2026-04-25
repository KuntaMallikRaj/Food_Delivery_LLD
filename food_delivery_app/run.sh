#!/bin/bash
export PATH="/opt/homebrew/opt/java/bin:$PATH"
mkdir -p out
find . -name "*.java" | xargs javac -d out && java -cp out food_delivery_app.Main.main
