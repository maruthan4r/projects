//Selectors(Gets the first tags where class is .todo-...)
const todoInput = document.querySelector('.todo-input');
const todoButton = document.querySelector('.todo-button');
const todoList = document.querySelector('.todo-list');

//event listener

//excecutes addTodo() on click
todoButton.addEventListener('click', addTodo);

function addTodo(event) {

    //prevents from submitting
    event.preventDefault();

}