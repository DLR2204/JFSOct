import { Component } from "react";
import './style.css';

export class ChildToParent extends Component{
    state={}

    getData=(name,id,address)=>{
        this.setState({
            name:name,
            id:id,
            address:address

        })
    }


    render(){
        return(<div className="parent">

            <p>Name:-{this.state.name}</p>
            <p>Id:-{this.state.id}</p>
            <p>Address:-{this.state.address}</p>

            <Child1 onChange={this.getData}/>

        </div>);
    }
}

class Child1 extends Component{

    state={name:'sankeerth',id:10,address:'india'}

    send=()=>{
        this.props.onChange(this.state.name,this.state.id,this.state.address)
    }
    
    render(){
        return(<div className="child">

            <button type="button" onClick={this.send}>sendData</button>

        </div>);
    }
}