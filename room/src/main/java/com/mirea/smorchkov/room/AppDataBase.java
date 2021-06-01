package com.mirea.smorchkov.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Employee.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {
    public abstract EmployeeDao employeeDao();
}