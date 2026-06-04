# hospital-system
# Descripción de cada archivo:

Main.java: Clase principal

HospitalConfig.java: Configuración "global" del hospital. Actualmente se pueden crear múltiples configuraciones:
    HospitalConfig a = new HospitalConfig();
    HospitalConfig b = new HospitalConfig();

ICURoom.java:(Sala de cuidados intensivos). Crear una sala requiere:
    ICURoom room1 = new ICURoom();
    ICURoom room2 = new ICURoom();
    ICURoom room3 = new ICURoom();

LegacyMonitor.java: Monitor del nuevo fabricante

DeviceManager.java: Software interno que espera trabajar con cualquier dispositivo médico mediante la interfaz "MedicalDevice"



//pequeño avance en singelton, falta el adapter y el Prototype.