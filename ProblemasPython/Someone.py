class Persona:
    def __init__(self, nombre, apellido, nota1, nota2, nota3):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__nota1 = nota1
        self.__nota2 = nota2
        self.__nota3 = nota3
        self.__promedio = 0
        self.__mensaje = ""

    def calcularPromedio(self):
        self.__promedio = (self.__nota1 + self.__nota3 + self.__nota2) / 3

        if self.__promedio < 51:
            self.__mensaje = "Reprobado"
        else:
            self.__mensaje = "Aprobado"

    def mostrar(self):
        self.calcularPromedio()
        print("Nombre :" + self.__nombre + " Apellido :" + self.__apellido + " Promedio:", self.__promedio, self.__mensaje)

