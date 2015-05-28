package com.example.echeverria.lsensores;

import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.hardware.Sensor;
import java.util.List;

public class MainActivity extends ActionBarActivity implements SensorEventListener{

    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salida = (TextView) findViewById(R.id.salida);

        //se crean los servicios de los sensores y cuales son los tipos.
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor: listaSensores) {
            log(sensor.getName());
        }
    }
    // Metodo para iniciar la escucha de los eventos de los sensores
    public void iniciarSensores(View v){
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        //sensor de orientacion
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);
        if (!listaSensores.isEmpty()) {
            Sensor orientationSensor = listaSensores.get(0);
            sensorManager.registerListener(this, orientationSensor,SensorManager.SENSOR_DELAY_UI);
        }
        //sensor de acelerometro.
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if (!listaSensores.isEmpty()) {
            Sensor acelerometerSensor = listaSensores.get(0);
            sensorManager.registerListener(this, acelerometerSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de giroscopio
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);
        if (!listaSensores.isEmpty()) {
            Sensor giroscopioSensor = listaSensores.get(0);
            sensorManager.registerListener(this, giroscopioSensor,SensorManager.SENSOR_DELAY_UI);
        }
        //sensor de campo magnetico
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);
        if (!listaSensores.isEmpty()) {
            Sensor magneticSensor = listaSensores.get(0);
            sensorManager.registerListener(this, magneticSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de temperatura
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);
        if (!listaSensores.isEmpty()) {
            Sensor temperatureSensor = listaSensores.get(0);
            sensorManager.registerListener(this, temperatureSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de proximidad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);
        if (!listaSensores.isEmpty()) {
            Sensor proximitySensor = listaSensores.get(0);
            sensorManager.registerListener(this, proximitySensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de gravedad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);
        if (!listaSensores.isEmpty()) {
            Sensor gravedadSensor = listaSensores.get(0);
            sensorManager.registerListener(this, gravedadSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de luz
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);
        if (!listaSensores.isEmpty()) {
            Sensor luzSensor = listaSensores.get(0);
            sensorManager.registerListener(this, luzSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    //Metodo para limpiar los campos de la actividad.
    public  void limpiar (View v) {
        salida.setText("");

        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for (Sensor sensor: listaSensores) {
            log(sensor.getName());
        }
    }

    // metodo para detener los eventos de escucha de los sensores y evitar que la aplicacion consuma recursos
    public void detenerSensores(View v){
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);
        //sensor de orientacion
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);
        if (!listaSensores.isEmpty()) {
            Sensor orientationSensor = listaSensores.get(0);
            sensorManager.registerListener(this, orientationSensor,SensorManager.SENSOR_DELAY_UI);
        }
        //sensor de acelerometro.
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if (!listaSensores.isEmpty()) {
            Sensor acelerometerSensor = listaSensores.get(0);
            sensorManager.registerListener(this, acelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de giroscopio
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);
        if (!listaSensores.isEmpty()) {
            Sensor giroscopioSensor = listaSensores.get(0);
            sensorManager.registerListener(this, giroscopioSensor, SensorManager.SENSOR_DELAY_UI);
        }
        //sensor de campo magnetico
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);
        if (!listaSensores.isEmpty()) {
            Sensor magneticSensor = listaSensores.get(0);
            sensorManager.registerListener(this, magneticSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de temperatura
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);
        if (!listaSensores.isEmpty()) {
            Sensor temperatureSensor = listaSensores.get(0);
            sensorManager.registerListener(this, temperatureSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de proximidad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);
        if (!listaSensores.isEmpty()) {
            Sensor proximitySensor = listaSensores.get(0);
            sensorManager.registerListener(this, proximitySensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de gravedad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);
        if (!listaSensores.isEmpty()) {
            Sensor gravedadSensor = listaSensores.get(0);
            sensorManager.registerListener(this, gravedadSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de luz
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);
        if (!listaSensores.isEmpty()) {
            Sensor luzSensor = listaSensores.get(0);
            sensorManager.registerListener(this, luzSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    //Se agregan los estados en que se puede encontrar alguna actividad.
    @Override
    protected void onPause() {
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManager.unregisterListener(this);
        super.onPause();
    }

    //Se agregan los estados en que se puede encontrar alguna actividad.
    @Override
    protected void onRestart() {
        super.onRestart();
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        List<Sensor> listaSensores = sensorManager.getSensorList(Sensor.TYPE_ALL);

        //sensor de orientacion
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);
        if (!listaSensores.isEmpty()) {
            Sensor orientationSensor = listaSensores.get(0);
            sensorManager.registerListener(this, orientationSensor,SensorManager.SENSOR_DELAY_UI);
        }
        //sensor de acelerometro.
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if (!listaSensores.isEmpty()) {
            Sensor acelerometerSensor = listaSensores.get(0);
            sensorManager.registerListener(this, acelerometerSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de giroscopio
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);
        if (!listaSensores.isEmpty()) {
            Sensor giroscopioSensor = listaSensores.get(0);
            sensorManager.registerListener(this, giroscopioSensor,SensorManager.SENSOR_DELAY_UI);
        }
        //sensor de campo magnetico
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);
        if (!listaSensores.isEmpty()) {
            Sensor magneticSensor = listaSensores.get(0);
            sensorManager.registerListener(this, magneticSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de temperatura
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_TEMPERATURE);
        if (!listaSensores.isEmpty()) {
            Sensor temperatureSensor = listaSensores.get(0);
            sensorManager.registerListener(this, temperatureSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de proximidad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);
        if (!listaSensores.isEmpty()) {
            Sensor proximitySensor = listaSensores.get(0);
            sensorManager.registerListener(this, proximitySensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de gravedad
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);
        if (!listaSensores.isEmpty()) {
            Sensor gravedadSensor = listaSensores.get(0);
            sensorManager.registerListener(this, gravedadSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
        //sensor de luz
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);
        if (!listaSensores.isEmpty()) {
            Sensor luzSensor = listaSensores.get(0);
            sensorManager.registerListener(this, luzSensor,SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    //Se agregan los estados en que se puede encontrar alguna actividad.
    @Override
    protected void onDestroy() {
        SensorManager sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorManager.unregisterListener(this);
        super.onDestroy();
    }

    //Mostramos los resultados dependiendo del movimiento que puedan tener los sensores.
    @Override
    public void onSensorChanged(SensorEvent event) {
        synchronized (this) {
            switch (event.sensor.getType()) {
                case Sensor.TYPE_ORIENTATION:
                    break;
                case Sensor.TYPE_ACCELEROMETER:
                    salida.append("\n");
                    log("ACELERÓMETRO");
                    log("Acelerómetro X: " + event.values[0]);
                    log("Acelerómetro Y: " + event.values[1]);
                    log("Acelerómetro Z: " + event.values[2]);
                    break;
                case Sensor.TYPE_GYROSCOPE:
                    //salida.append( "\n");
                    //log("GIROSCOPIO");
                    //log("Eje X: "+event.values[0]);
                    //log("Eje Y: "+event.values[1]);
                    //log("Eje Z: "+event.values[2]);
                    break;
                case Sensor.TYPE_MAGNETIC_FIELD:
                    salida.append("\n");
                    log("CAMPO MAGNETICO");
                    log("Eje X: " + event.values[0]);
                    log("Eje Y: " + event.values[1]);
                    log("Eje Z: " + event.values[2]);
                    break;
                case Sensor.TYPE_PROXIMITY:
                    salida.append("\n");
                    log("PROXIMIDAD");
                    log("Proximidad: " + event.values[0]);
                    break;
                case Sensor.TYPE_LIGHT:
                    break;
                case Sensor.TYPE_GRAVITY:
                    break;
                default:
                    salida.append("\n");
                    for (int i = 0; i < event.values.length; i++) {
                        log("Temperatura " + i + ": " + event.values[i]);
                    }
            }
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
    //Sirve para dar un salto de linea en cada resultado.
    private void log (String string) {
        salida.append(string + "\n");
    }
}