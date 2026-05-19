# Refactorizacion_AEE
María Dolores Barba López y Antonio Muñoz Herrera
## Creación del paquete
Con la guía proporcionada, se ha seguido los pasos para la creación del paquete "factorizar" y se ha ejecutado el test. Los códigos los hemos copiado de la guía para proceder a continuación a su refactorización.

## Inicio de la refactorización
Cuando ya teníamos los códigos copiados, tocaba comenzar a refactorizar. El primer paso fue cambiar el nombre de la firma, ya que este era muy genérico. Por tanto, pulsamos Ctrl + R, para cambiar el nombre de cT a calcularTotal. Una vez hecho esto, comprobamos que estaba todo bien en GitHub. Para ello, contestamos las siguientes preguntas: 
1.Números mágicos. ¿Qué significa 0.25 o 0.15? Son valores hardcodeados sin contexto. 
Si mañana el IVA o el descuento cambian, ¿dónde los buscamos?

Son los valores que se le dan a los descuentos, el 0.25 significa que se aplicará un 25% de descuento, mientras que 0.15 significa un 15% de descuento
En caso de que el IVA cambie, habrá que modificar el código entero, ya que no se han declarado constantes que almacenen estos valores. 

Variables sin significado. Nombres como cT, m, tC o dV no aportan ninguna semántica. Nos obligan a adivinar.

Algunos de los nombres que se dan dentro del código no aclaran lo que hacen. En el primer caso, de cT, hemos averiguado que se trata de calcularTotal, cambiándole el nombre
al igual que a otras, como m, que era importeBase, tC, que era tipoCliente y dV, que es esSocioVip. 

Código Spaghetti. La anidación de múltiples if-else crea una estructura en forma de flecha > que hace casi imposible seguir el flujo lógico de ejecución.

