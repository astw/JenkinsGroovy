import java.io.*; 
import groovy.io.*; 

def dir = new File("D:\\work\\jenkins\\JenkinsGroovy\\ConsoleApp1"); 

dir.eachFileRecurse(FileType.ANY) {
    file-> println(file.name + '\t' + file.length());
}

