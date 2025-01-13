import './movie.css';

function Movie(props){
    return(

        <div className="movie-card">

        <img src={props.image}/>
        <center><h2>{props.title}</h2>
        <p>{props.zoner}</p></center>
        </div>
    )
}

export default Movie;