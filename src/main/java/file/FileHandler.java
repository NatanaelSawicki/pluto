package com.br.julymvn.file;

import customexceptions.PlutoCustomException;
import customexceptions.PlutoFileNotFoundException;
import customexceptions.PlutoIOException;
import exception.ExceptionHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import object.ObjectHandler;

public class FileHandler {

    private static HashMap<String, File> listTempFiles = null;
    private static HashMap<String, File> listFilesToBeDeleted = null;
    private static HashMap<String, File> listDeletedFiles = null;
    
    public static File createFileObjet(String dir) 
            throws PlutoFileNotFoundException{
        if(fileExists(dir)){
            return new File(dir);
        }else{
            throw new PlutoFileNotFoundException();
        }
    }
    
    public static boolean fileExists(String dir) {
        return new File(dir).exists();
    }

    public static boolean canRead(String dir) {
        return new File(dir).canRead();
    }

    public static boolean canExecute(String dir) {
        return new File(dir).canExecute();
    }

    public static boolean canWrite(String dir) {
        return new File(dir).canWrite();
    }

    public static boolean isFile(String dir) {
        return new File(dir).isFile();
    }

    public static boolean isDirectory(String dir) {
        return new File(dir).isDirectory();
    }

    public static boolean isNotVisible(String dir) {
        return new File(dir).isHidden();
    }
    
    private static void initHashMap(HashMap param){
        if (ObjectHandler.isHashMapEmpty(param)){
            param = new HashMap<>();
        }
    }
    
    public static boolean deleteFile(String dir){
        if(isFile(dir) && canExecute(dir)){
            File f = new File(dir);
            addDeletedFiles(f);
            return f.delete();
        }
        return false;
    }

    public static String getFilePath(String dir){
        return new File(dir).getPath();
    }
    
    public static boolean wasFileDeleted(String dir){
        return listDeletedFiles.containsKey(getFilePath(dir));
    }
    
    public static boolean wasFileSetToBeDeleted(String dir){
        return listFilesToBeDeleted.containsKey(getFilePath(dir));
    }
    
    public static boolean tempFileExists(String dir){
        return listTempFiles.containsKey(getFilePath(dir));
    }
    
    public static boolean deleteAfterExit(String dir){
        if(isFile(dir) && canExecute(dir)){
            File f  = new File(dir);
            addToBeDeletedFiles(f);
            f.deleteOnExit();
            return true;
        }
        return false;
    }
    
    private static void addToBeDeletedFiles(File f){
        initHashMap(listFilesToBeDeleted);
        listFilesToBeDeleted.put(f.getPath(), f);
    }
    
    private static void addDeletedFiles(File f){
        initHashMap(listDeletedFiles);
        listDeletedFiles.put(f.getPath(), f);
    }
    
    public static boolean addTempFile(File tempFile) 
            throws PlutoCustomException{
        boolean funcRet = false;
        try{
            listTempFiles.put(tempFile.getName(), tempFile);
            funcRet = true;
        }catch(Exception ex){
            throw new PlutoCustomException(ExceptionHandler.getExceptionDetails(ex));
        }
        return funcRet;
    }
    
    public static boolean containsAnyTempFile(){
        return listTempFiles.isEmpty() || listTempFiles == null;
    }
    
    
    public static File createTempFile(String prefix, 
            String sufix,
            String dir) 
            throws PlutoIOException, PlutoCustomException{
        try {
            File fTemp = File.createTempFile(prefix, sufix, new File(dir));
            addTempFile(fTemp);
            return File.createTempFile(prefix, sufix, new File(dir));
        } catch (IOException ex) {
            throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
        }
    }
    
    public static boolean createFile(String dir)
            throws PlutoIOException {
        if (!fileExists(dir)) {
            try {
                return new File(dir).createNewFile();
            } catch (IOException ex) {
                throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
            }
        }
        return false;
    }

    public static String readFile(String dir)
            throws PlutoFileNotFoundException, PlutoIOException {
        StringBuilder fileContent = new StringBuilder();
        if (fileExists(dir) && canRead(dir)) {
            File f = new File(dir);
            try {
                BufferedReader br = new BufferedReader(new FileReader(f));
                String lineRead;
                while ((lineRead = br.readLine()) != null) {
                    fileContent.append(lineRead);
                }
            } catch (java.io.FileNotFoundException ex) {
                throw new PlutoFileNotFoundException(ExceptionHandler.getExceptionDetails(ex));
            } catch (IOException ex) {
                throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
            }
        }
        return fileContent.toString();
    }

    public static boolean isFileEmpty(String dir)
            throws PlutoIOException, PlutoFileNotFoundException {
        if (fileExists(dir) && canRead(dir)) {
            try {
                return new BufferedReader(
                        new FileReader(
                                new File(dir)
                        )
                ).readLine() == null;
            } catch (java.io.FileNotFoundException ex) {
                throw new PlutoFileNotFoundException(ExceptionHandler.getExceptionDetails(ex));
            } catch (IOException ex) {
                throw new PlutoIOException(ExceptionHandler.getExceptionDetails(ex));
            }
        }
        return false;
    }

}
