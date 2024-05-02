class placeHolder{
  void message() {
    System.out.println("this is a place holder file!");
  }

  void howToAccess() {
    System.out.println("as per Northeastern class policy, I am not allowed to publicly release " +
          "the code, please contact me to see the original");
  }
}

//Here are the instructions: 

// Welcome to our maze game!
// On start-up, an unbiased maze is randomly generated
// Key Bindings:
// press the up, down, left, and right arrow keys to manually move through the maze
// press q to toggle between being able to see previously viewed paths and not
// press spacebar in order to generate a new random maze
// press h to generate a horizontally biased maze
// press v to generate a vertically biased maze

// cool effects:

// if you want the solution to the maze, you can press b or d,
// which will animate the solution through the maze via breadth first search
// or depth first search, respectively.

// press g to toggle a temperature gradient of how far each cell is from the start
// press f to toggle a temperature gradient of how far each cell is from the end

// if the user reaches the end, they can choose to continue playing by generating a new maze
// via spacebar/h/v, or they can bfs/dfs through the maze, or they can exit out!

// while the maze is being generated, these functionalities are not available, as the user
// must wait before the entire maze is constructed in order to move
