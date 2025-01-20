import { Component } from "react";


export class ListndKeys extends Component{

    state={users:[{id:100,name:'Ramesh'},{id:101,name:'Suresh'},{id:102,name:'Naresh'},{id:103,name:'Mahesh'},{id:104,name:'Rajesh'},{id:105,name:'Somesh'}]}

    render(){
        return(<div>
            <h1><u>List in react</u></h1>

            {this.state.users.map(x=>(
                <p key={x.id}>{x.id}={x.name}</p>
            ))}

        </div>);
    }
}