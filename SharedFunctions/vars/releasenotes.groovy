import java.io.*; 
import groovy.io.*; 

@NonCPS
def call(Map config=[:]) {

    def dir = new File(pwd());       
    new File(dir.path + '/releaseNotes.txt').withWriter('utf-8')
    {
        writer ->  dir.eachFileRecurse(FileType.ANY) {
           //file-> println(file.name + '\t' + file.length());
           file-> 
               if(!file.isDirectory()){
                   writer.writeLine('\t' +  file.name + '\t' + file.length());       
               }
               else { 
                   writer.writeLine(file.name);
               }
       }  
    }
}