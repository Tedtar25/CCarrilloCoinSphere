CoinSphere (demo)

Pequeña app de ejemplo hecha con Jetpack Compose que replica un tablero estilo CoinMarketCap: tarjetas de métricas y una lista simple de criptomonedas con tema oscuro y acentos azules.
Las imágenes de las monedas se cargan desde internet usando Coil.

Tecnologías

Kotlin + Jetpack Compose (Material3)

Coil (carga de imágenes desde URL)

Min SDK 26 · Target/Compile SDK 36

Qué incluye

Layouts básicos: Column, Row, LazyColumn, LazyRow, Card

Tema oscuro + tipografía básica

Carga de imágenes con Coil (crossfade, tamaño fijo y recorte circular)

Permiso de Internet declarado en AndroidManifest.xml

Cómo correr

Clonar el repo y abrir en Android Studio.

Sincronizar Gradle.

Ejecutar en un emulador o dispositivo (el @Preview de Compose no siempre descarga imágenes de internet, así que prueba en un device real o AVD).

Imágenes de criptomonedas

Para que Coil funcione, las URLs deben ser directas a una imagen (PNG/JPG) y públicas (HTTPS).
Algunas fuentes útiles:

Cryptocurrency Icons (GitHub):
https://raw.githubusercontent.com/spothq/cryptocurrency-icons/master/128/color/<symbol>.png
Ej.: btc.png, eth.png, usdt.png, sol.png.

CoinGecko Assets: URLs estáticas por id o el campo image que dan sus endpoints (si usas su API).

Trust Wallet Assets: útil para tokens por cadena/contrato.

Nota: verifica licencias/atribución si vas a distribuir.

Nota sobre IA

Este proyecto no fue generado por IA. Únicamente se usó asistencia de IA para destrabar el acomodo y la carga de imágenes con Coil (tamaño, placeholders y el uso de URLs directas), ya que inicialmente las imágenes no aparecían en el dispositivo.
Todo el código y el diseño fueron escritos a mano.
Tambien una parte para mejorar este README.

Estado

Demo educativa; no pretende ser “lo más machín”, pero cumple con:

layouts básicos,

Coil para imágenes desde internet,

colores/estilos de MaterialTheme,

tema oscuro con acentos azules.
