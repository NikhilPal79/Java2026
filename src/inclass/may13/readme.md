# CONTROLLING AN OBJECT 
--> 2 METHODS
1. POST INIT 
2. PRE DESTROY [ONLY TRIGGERED WHEN BEAN IS DESTROYED , MEANS APPLICATION,CONTEXT SHUT DOWN ]
3. DESTROY [WON'T BE ABLE TO SEE, WHEN CONTEXT.GET BEAN GOT KILLED NOTHING PRINTED ]

# TO SHOWCASE DESTROY METHOD [WE CAN DO IT MANUALLY ]
[APPLICATION CONTEXT IS PARENT CLASS OF CLASS PATH XML APPLICATION CONTEXT ]
[SO TO SHOWCASE DESTROY METHOD , WE USE CONFIGURABLE APPLICATION CONTEXT ]
# CONFIGURABLE APPLICATION CONTEXT will provide the registershutdownhook which will show the implementation of destroy method when application got killed 


# SECOND WAY TO CREATE BEAN 

# JAVA BASED CONFIGURATION [make a config package]
1. all the bean that we will create will be written as a java method 

@configuration [when spring needs to scan the class, class go to look for @configuration ]
@bean [bean creation comes from @bean]