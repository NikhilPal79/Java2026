# Singleton Design Pattern

# WHAT is Singleton?
A class that allows only ONE instance to be created throughout the entire application.

# WHY use Singleton?

1. Prevent multiple instances that waste memory
2. Provide single global access point
3. Maintain a consistent state across the app
4. Control access to shared resources


# WHEN to use Singleton?

1. Database connections
2. Logger systems
3. Configuration settings
4. Thread pools
5. Cache management


# WHERE it's used in real life?

1. Hibernate uses Singleton for SessionFactory
2. Spring Framework beans are Singleton by default
3. Java Runtime — Runtime.getRuntime() is a Singleton
4. Logging — Logger.getInstance()