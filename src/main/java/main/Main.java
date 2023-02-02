
package main;

import controller.ProjectController;
import controller.TaskController;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.Project;
import model.Task;
import util.ConnectionFactory;


public class Main {

  
    public static void main(String[] args) {

        TaskController taskController = new TaskController();
        Task task = new Task();
      //  task.setIdProject(2);
        //System.out.println(task.getIdProject());
        //task.setName("Tarefinha Teste");
        //task.setDescription("Fazer tarefa todos os dias para teste");
        //task.setNotes("Sem notas");
        //task.setIsCompleted(true);
        //task.setDeadline(new Date());
        
      //taskController.save(task);
      //task.setIdProject(2);
      //task.setDescription("description atualizada");
      //task.setName("Nome atualizado");
      //task.setNotes("Utilizando primeira nota com update");
      //task.setIsCompleted(true);
      //task.setDeadline(new Date());
      //taskController.save(task);
        
     // List<Task>tasks = taskController.getAll(2);
      //System.out.println("Total de tasks = " + tasks.size());
        
      
        // ProjectController projectController = new ProjectController();
        //Project project = new Project();
        
        //project.setName("Projetinho da semana");
        //project.setDescription("Utilizando descrição");
        //projectController.save(project);
        
       // project.setId(1);
        //project.setName("Projeto atualizado");
        //project.setDescription("descricao atualizada");
        
        
        //projectController.update(project);
        
        //List<Project> projects = projectController.getAll();
        //System.out.println("Total de Projetos = " + projects.size() );
        
        
        //projectController.removeById(1);
        
    }
    
}
