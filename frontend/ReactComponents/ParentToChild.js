import { Component } from "react";
import './style.css';

export class ParentToChild extends Component{

    state={name:'sankeerth',id:100}

    render(){
        return(<div className="parent">
<h1>Iam from the parent Component</h1>

            <Child name={this.state.name} id={this.state.id}/>

        </div>);
    }
}

class Child extends Component{

    render(){
        return(<div className="child">
            <h1>Iam from the child Component</h1>

            <p>Name :-{this.props.name} </p>
            <p>Id:- {this.props.id}</p>
        </div>);
    }

}