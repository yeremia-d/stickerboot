import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {LogoComponent} from './logo.component';

describe('StbtLogoComponent', () => {
  let component: LogoComponent;
  let fixture: ComponentFixture<LogoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [LogoComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LogoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });

  it('should create a component with height and width specified values', () => {

  });

  it('should create a reversed logo component when passing the \'style=reversed\' prop', () => {

  });
});
