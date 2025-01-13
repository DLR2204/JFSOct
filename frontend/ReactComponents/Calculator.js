 import { Component } from "react";
class Calculator extends Component{

    state ={a:10,b:5,showResult:false}

    setA= (e)=>{
        
        this.setState(
            {a:parseInt(e.target.value)
            ,showResult:false
            })
        }

    setB=e=>{this.setState({b:parseInt(e.target.value),showResult:false})}


    check = e =>{
        this.setState(prevState=>{
            return {showResult:!prevState.showResult};
        })
    }


    render(){
        
        return(
                    <div>
                        <h1><u>Calculator</u></h1>

                    <input type="text" placeholder="A" onChange={this.setA}/>

                    <input type="text" placeholder="B" onChange={this.setB}/>

                <button type="button" onClick={this.check} >CheckResult</button>

                {this.state.showResult?(<div>
                    
                    <h1>  Add:-{this.state.a+this.state.b}<br></br>
                            Sub:-{this.state.a-this.state.b}<br></br>
                            Div:-{this.state.a/this.state.b}<br></br>
                            Mul:-{this.state.a*this.state.b}<br></br></h1>
                            
                            </div>):

                            (<div>
                            <h1>Please click the check result button</h1> 
                                
                                </div>)}

                         


                    </div>



    );}


}

export default Calculator;